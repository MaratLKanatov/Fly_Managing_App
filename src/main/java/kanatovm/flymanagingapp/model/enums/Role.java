package kanatovm.flymanagingapp.model.enums;

import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.List;
import java.util.stream.Collectors;

public enum Role {
    CLIENT(List.of(Permission.PERMISSION_BASIC_ACCESS)),
    AIRLINE(List.of(Permission.PERMISSION_AIRLINE_ACCESS)),
    ADMIN(List.of(Permission.PERMISSION_FULL_ACCESS));

    private final List<SimpleGrantedAuthority> authorities;

    Role(List<Permission> permissions) {
        authorities = permissions.stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(Collectors.toList());
    }
}
