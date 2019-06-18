package com.nqc.servise.impl;

import com.nqc.service.HomeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class HomeServiceImpl  implements HomeService {
    @Override
    public List<String> loadMenu() {
        List<String> menus= new ArrayList<>();
        menus.add("Blog java");
        menus.add("Hướng dẫn học Java Web");
        menus.add("Liên hệ");
        menus.add("Thanh toán");
        return menus;
    }
}
