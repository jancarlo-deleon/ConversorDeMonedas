package dto;

public record MonedaDto(String base_code,
                        String target_code,
                        Double conversion_rate,
                        Double conversion_result) {
}
