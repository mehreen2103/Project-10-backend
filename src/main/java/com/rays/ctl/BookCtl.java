package com.rays.ctl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.ORSResponse;
import com.rays.dto.BookDTO;
import com.rays.form.BookForm;
import com.rays.service.BookServiceInt;

@RestController
@RequestMapping(value = "Book")
public class BookCtl extends BaseCtl<BookForm, BookDTO, BookServiceInt>{
	
	@GetMapping("/preload")
	public ORSResponse preload() {

		ORSResponse res = new ORSResponse(true);

		return res;
	}

}
