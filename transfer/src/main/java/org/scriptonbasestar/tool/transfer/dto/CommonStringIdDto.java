package org.scriptonbasestar.tool.transfer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * @author archmagece
 * @with sb-tool-jvm
 * @since 2015-08-17-12
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonStringIdDto
	implements Serializable {
	@NotNull
	@Size(min = 1)
	private String id;
}
