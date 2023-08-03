package com.project.usoon.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.project.usoon.entity.AddressBook;
import com.project.usoon.mapper.AddressBookMapper;
import com.project.usoon.service.AddressBookService;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {
}
