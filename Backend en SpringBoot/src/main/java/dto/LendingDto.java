
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
public class LendingDto {
    private int idLibro;
    private String nombreUsuario;
    private String nombreLibro;
    private String autorLibro;
    private String fechaSalida;
    private String fechaPrevistaDevolucion;
}
