package kanatovm.flymanagingapp.model.enums;

public enum Permission {
    PERMISSION_BASIC_ACCESS("BASIC_ACCESS"),
    PERMISSION_AIRLINE_ACCESS("AIRLINE_ACCESS"),
    PERMISSION_FULL_ACCESS("FULL_ACCESS");

    private final String permission;

    Permission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
