package com.trainings.ws.soap.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="PaymentProcessorResponse")
@XmlAccessorType(XmlAccessType.FIELD)

public class PaymentProcessorResponse {
	@XmlElement(name="result",required=true)
	private boolean result;

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}
}
