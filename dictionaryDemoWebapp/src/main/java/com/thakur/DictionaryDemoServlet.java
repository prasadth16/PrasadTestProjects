package com.thakur;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dictionary.DictionaryService;
import dictionary.DictionaryService;

public class DictionaryDemoServlet extends HttpServlet {

	public DictionaryService dictionary;// = DictionaryService.getInstance();

	public void init() {
		dictionary = DictionaryService.getInstance();
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServerException {
		String inputWord = req.getParameter("word");
		String meaning = dictionary.getDefinition(inputWord);
		if (meaning == null)
			meaning = "could not find a word in dictionary!!!!";
		PrintWriter writer = res.getWriter();
		writer.print(meaning);

	}

	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException {
		doGet(req, res);
	}
}
