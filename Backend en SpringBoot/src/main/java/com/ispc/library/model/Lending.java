
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
public class Lending {
    private int id;
    private int userId;
    private int bookId;
    private String dateOut;
    private String dateReturn;
    
}
