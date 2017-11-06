package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;
/**
 * Contains all submissions for a population
 */
@ApiModel(description = "Contains all submissions for a population")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-05-30T13:04:33.940Z")

public class PopulationSubmissionData   {
  @JsonProperty("population")
  private PopulationData population = null;

  @JsonProperty("submissions")
  private List<String> submissions = new ArrayList<String>();

  public PopulationSubmissionData population(PopulationData population) {
    this.population = population;
    return this;
  }

   /**
   * Get population
   * @return population
  **/
  @ApiModelProperty(value = "")
  public PopulationData getPopulation() {
    return population;
  }

  public void setPopulation(PopulationData population) {
    this.population = population;
  }

  public PopulationSubmissionData submissions(List<String> submissions) {
    this.submissions = submissions;
    return this;
  }

  public PopulationSubmissionData addSubmissionsItem(String submissionsItem) {
    this.submissions.add(submissionsItem);
    return this;
  }

   /**
   * submissions that describe the population
   * @return submissions
  **/
  @ApiModelProperty(value = "submissions that describe the population")
  public List<String> getSubmissions() {
    return submissions;
  }

  public void setSubmissions(List<String> submissions) {
    this.submissions = submissions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PopulationSubmissionData populationSubmissionData = (PopulationSubmissionData) o;
    return Objects.equals(this.population, populationSubmissionData.population) &&
        Objects.equals(this.submissions, populationSubmissionData.submissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(population, submissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PopulationSubmissionData {\n");
    
    sb.append("    population: ").append(toIndentedString(population)).append("\n");
    sb.append("    submissions: ").append(toIndentedString(submissions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
