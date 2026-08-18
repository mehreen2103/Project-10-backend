package com.rays.service;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;
import com.rays.common.BaseServiceImpl;
import com.rays.dao.BookDAOInt;
import com.rays.dto.BookDTO;

@Service
@Transactional
public class BookServiceImpl extends BaseServiceImpl<BookDTO, BookDAOInt> implements BookServiceInt{

}
