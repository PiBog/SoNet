package ua.pp.sola.sonet.auth.entity;

import org.springframework.data.annotation.Id;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class User implements UserDetails {

    @Id
    private final String userName;
    private final String userPassword;
    private final boolean accountNonExpired;
    private final boolean accountNonLocked;
    private final boolean credentialsNonExpired;
    private final boolean userEnabled;
    private final List<GrantedAuthority> authorities;

    private User(Builder userBuilder) {
        this.userPassword = userBuilder.userPassword;
        this.userName = userBuilder.userName;
        this.accountNonExpired = userBuilder.accountNonExpired;
        this.accountNonLocked = userBuilder.accountNonLocked;
        this.credentialsNonExpired = userBuilder.credentialsNonExpired;
        this.userEnabled = userBuilder.userEnabled;
        this.authorities = userBuilder.authorities;
    }


    /**
     * Returns the authorities granted to the user. Cannot return <code>null</code>.
     *
     * @return the authorities, sorted by natural key (never <code>null</code>)
     */
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    /**
     * Returns the password used to authenticate the user.
     *
     * @return the password
     */
    @Override
    public String getPassword() {
        return this.userPassword;
    }

    /**
     * Returns the username used to authenticate the user. Cannot return <code>null</code>.
     *
     * @return the username (never <code>null</code>)
     */
    @Override
    public String getUsername() {
        return this.userName;
    }

    /**
     * Indicates whether the user's account has expired. An expired account cannot be
     * authenticated.
     *
     * @return <code>true</code> if the user's account is valid (ie non-expired),
     * <code>false</code> if no longer valid (ie expired)
     */
    @Override
    public boolean isAccountNonExpired() {
        return this.accountNonExpired;
    }

    /**
     * Indicates whether the user is locked or unlocked. A locked user cannot be
     * authenticated.
     *
     * @return <code>true</code> if the user is not locked, <code>false</code> otherwise
     */
    @Override
    public boolean isAccountNonLocked() {
        return this.accountNonLocked;
    }

    /**
     * Indicates whether the user's credentials (password) has expired. Expired
     * credentials prevent authentication.
     *
     * @return <code>true</code> if the user's credentials are valid (ie non-expired),
     * <code>false</code> if no longer valid (ie expired)
     */
    @Override
    public boolean isCredentialsNonExpired() {
        return this.credentialsNonExpired;
    }

    /**
     * Indicates whether the user is enabled or disabled. A disabled user cannot be
     * authenticated.
     *
     * @return <code>true</code> if the user is enabled, <code>false</code> otherwise
     */
    @Override
    public boolean isEnabled() {
        return this.userEnabled;
    }

    public static class Builder {

        private String userName;
        private String userPassword;
        private boolean accountNonExpired = false;
        private boolean accountNonLocked = false;
        private boolean credentialsNonExpired = false;
        private boolean userEnabled = false;
        private List<GrantedAuthority> authorities = new ArrayList<>();

        public Builder(){}

        public Builder userName(String userName){
            this.userName = userName;
            return  this;
        }
        public Builder userPassword(String userPassword){
            this.userPassword = userPassword;
            return  this;
        }


        public Builder  accountNonExpired(boolean accountNonExpired){
            this.accountNonExpired = accountNonExpired;
            return this;
        }

        public Builder  accountNonLocked(boolean accountNonLocked){
            this.accountNonLocked = accountNonLocked;
            return this;
        }

        public Builder  credentialsNonExpired(boolean credentialsNonExpired){
            this.credentialsNonExpired = credentialsNonExpired;
            return this;
        }

        public Builder  userEnabled(boolean userEnabled){
            this.userEnabled = userEnabled;
            return this;
        }

        public Builder  authorities(List<GrantedAuthority> authorities){
            this.authorities = authorities;
            return this;
        }

        public User build(){
            return new User(this);
        }

    }

}
