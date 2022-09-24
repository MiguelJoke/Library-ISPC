

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
public class Book {
    private int id;
    private String title;
    private String date;
    private String author;
    private String category;
    private String edit;
    private String lang;
    private String pages;
    private String description;
    private String ejemplares;
    private int stock;
    private int available;
    private boolean borrado;
}
