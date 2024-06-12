package com.api.prechell.domain.member;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Gender {
    MALE("MALE"),
    FEMALE("FEMALE");
    private final String text;
}
