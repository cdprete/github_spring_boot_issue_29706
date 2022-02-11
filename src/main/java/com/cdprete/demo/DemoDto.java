package com.cdprete.demo;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

/**
 * @author Cosimo Damiano Prete
 * @since 11/02/2022
 */
public class DemoDto implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Valid
    private List<DemoInnerDto> values;

    public List<DemoInnerDto> getValues() {
        return values;
    }

    public void setValues(List<DemoInnerDto> values) {
        this.values = values;
    }

    public static class DemoInnerDto implements Serializable {
        @Serial
        private static final long serialVersionUID = 1L;

        @NotNull
        private DemoEnum value;

        public DemoEnum getValue() {
            return value;
        }

        public void setValue(DemoEnum value) {
            this.value = value;
        }
    }

    enum DemoEnum {
        value
    }
}
