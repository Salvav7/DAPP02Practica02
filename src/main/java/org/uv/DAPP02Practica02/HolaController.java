/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/RestController.java to edit this template
 */
package org.uv.DAPP02Practica02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Ville
 */
@RestController
@RequestMapping("/Holamundo")
public class HolaController {

    @GetMapping
    public String holamundo() {
        return "Hola mundo";
    }

    @GetMapping("/2/")
    public String holamundo2() {
        return "Hola mundo dos ...";
    }
}
