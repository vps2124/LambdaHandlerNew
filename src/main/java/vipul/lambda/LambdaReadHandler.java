package vipul.lambda;

// import java.io.IOException;
import java.util.List;

/*import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.Table;
import com.amazonaws.services.dynamodbv2.model.ScanRequest;
import com.amazonaws.services.dynamodbv2.model.ScanResult;*/
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

// import vipul.lambda.dal.DynamoDbAdapter;

public class LambdaReadHandler implements RequestHandler<String, List<Survey>> {
	/*
	 * DynamoDbAdapter da = new DynamoDbAdapter(); Table table =
	 * da.getDynamoDBTable();
	 */

	@Override
	public List<Survey> handleRequest(String input, Context context) {
		// AmazonDynamoDB client =
		// AmazonDynamoDBClientBuilder.standard().withRegion(Regions.AP_SOUTH_1).build();
		// ScanRequest scanRequest = new ScanRequest().withTableName("Survey");
		// ScanResult result = client.scan(scanRequest);
		/*
		 * for (Map<String, AttributeValue> item : result.getItems()) { printItem(item);
		 * }
		 */
		return null;
	}

	/*
	 * public List<Survey> getList() throws IOException {
	 * 
	 * DynamoDBScanExpression scanExp = new DynamoDBScanExpression(); List<Product>
	 * results = this.mapper.scan(Product.class, scanExp); for (Product p : results)
	 * { logger.info("Products - list(): " + p.toString()); }
	 * 
	 * return results; }
	 */
}
