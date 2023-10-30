package com.adriatest.transferservice.model;

import lombok.*;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Client {
    private Long id;
    private String name;
    private String email;
}
