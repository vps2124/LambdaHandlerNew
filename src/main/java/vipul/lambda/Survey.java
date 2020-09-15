package vipul.lambda;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Survey {
	private int id;
	private boolean active;
	private String surveyName;
	private String surveyExpDate;
	private String surveyURL;
	private String surveyEmail;
	private String surveyTrigger;
	private String surveyAccessibility;

	public String toString() {
		final Gson gson = new GsonBuilder().setPrettyPrinting().create();
		return gson.toJson(this);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getSurveyName() {
		return surveyName;
	}

	public void setSurveyName(String surveyName) {
		this.surveyName = surveyName;
	}

	public String getSurveyExpDate() {
		return surveyExpDate;
	}

	public void setSurveyExpDate(String surveyExpDate) {
		this.surveyExpDate = surveyExpDate;
	}

	public String getSurveyURL() {
		return surveyURL;
	}

	public void setSurveyURL(String surveyURL) {
		this.surveyURL = surveyURL;
	}

	public String getSurveyEmail() {
		return surveyEmail;
	}

	public void setSurveyEmail(String surveyEmail) {
		this.surveyEmail = surveyEmail;
	}

	public String getSurveyTrigger() {
		return surveyTrigger;
	}

	public void setSurveyTrigger(String surveyTrigger) {
		this.surveyTrigger = surveyTrigger;
	}

	public String getSurveyAccessibility() {
		return surveyAccessibility;
	}

	public void setSurveyAccessibility(String surveyAccessibility) {
		this.surveyAccessibility = surveyAccessibility;
	}
}
