package vipul.lambda;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.PutItemOutcome;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.document.spec.PutItemSpec;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaFunctionHandler implements RequestHandler<Survey, SurveyResponse> {
	private DynamoDB dynamoDb;
	private String DYNAMODB_TABLE_NAME = "Survey";

	@Override
	public SurveyResponse handleRequest(Survey input, Context context) {

		AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().withRegion(Regions.AP_SOUTH_1).build();
		dynamoDb = new DynamoDB(client);
		Table table = dynamoDb.getTable(DYNAMODB_TABLE_NAME);
		SurveyResponse res = new SurveyResponse();
		try {
			System.out.println("Adding a new item...");
			PutItemOutcome outcome = table.putItem(new PutItemSpec().withItem(new Item().withNumber("id", input.getId())
					.withBoolean("active", input.isActive()).withString("surveyName", input.getSurveyName())
					.withString("surveyExpDate", input.getSurveyExpDate()).withString("surveyURL", input.getSurveyURL())
					.withString("surveyEmail", input.getSurveyEmail())
					.withString("surveyTrigger", input.getSurveyTrigger())
					.withString("surveyAccessibility", input.getSurveyAccessibility())));
			System.out.println("PutItem succeeded:\n" + outcome.getPutItemResult());
			res.setMsg("Success");
			res.setSurvey(input);
		} catch (Exception e) {
			System.err.println("Unable to add item: ");
			System.err.println(e.getMessage());
			res.setMsg("Unsuccess");
			res.setSurvey(input);
		}
		return res;
	}
}
