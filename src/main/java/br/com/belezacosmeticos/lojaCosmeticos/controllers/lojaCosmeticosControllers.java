/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.belezacosmeticos.lojaCosmeticos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author 20201114010030
 */
@Controller
public class lojaCosmeticosControllers {
    
    @GetMapping("/")
    public String index(){
        return "index";
    }
    
}
