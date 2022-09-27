package com.ispc.library.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Caro
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
    private int id;
    private String username;
    private String password;
    private String name;
    private String last_name_p;
    private String last_name_m;
    private String domicilio;
    private String tel;
    private int sanctions;
    private int sanc_money;
 }
