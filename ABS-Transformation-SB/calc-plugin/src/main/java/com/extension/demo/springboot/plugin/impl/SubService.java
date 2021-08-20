package com.extension.demo.springboot.plugin.impl;

import org.springframework.stereotype.Service;

import com.extension.demo.springboot.api.CalculatorService;

@Service
public class SubService implements CalculatorService {

	@Override
	public String name() {
		return "Subtraction";
	}

	@Override
	public int execute(int n1, int n2) {
		return n1 - n2;
	}

}
