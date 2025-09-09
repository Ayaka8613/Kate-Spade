package com.example.demo.controller;

import com.example.demo.service.PageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {
	private final PageService pageService;
	
	public PageController(PageService pageService) {
		this.pageService = pageService;
	}
	@GetMapping("/morning")
	public String morning() {
		return pageService.getMorningMessage();
	}
	@GetMapping("/night")
	public String night() {
		return pageService.getNightMessage();
	}
}
