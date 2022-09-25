
package dto;

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
public class LibrosDisponiblesDto {
    private int id;
    private String title;
    private String autor;
    private String category;
    private String lang;
}
