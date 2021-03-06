package com.Sapo.pet.model.request;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class PetModelRequest {

	@Valid
	@NotNull(message = "name not to be null!!")
	private String name;
	private String tags;
	private String content;
	@Valid
	private List<VariantModelRequest> variants;
	
	public PetModelRequest() {
		
	}
	
	public PetModelRequest(String name, String tags, String content) {
		this.name = name;
		this.tags = tags;
		this.content = content;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public List<VariantModelRequest> getVariants() {
		return variants;
	}
	public void setVariants(List<VariantModelRequest> variants) {
		this.variants = variants;
	}
	
	
}
