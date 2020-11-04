package springproject.serviceoauth.service;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.security.core.GrantedAuthority;import org.springframework.security.core.authority.SimpleGrantedAuthority;import org.springframework.security.core.userdetails.UserDetails;import org.springframework.security.core.userdetails.UserDetailsService;import org.springframework.security.core.userdetails.UsernameNotFoundException;import org.springframework.stereotype.Service;import springproject.serviceoauth.client.IUserFeign;import springproject.serviceoauth.entity.User;import java.util.List;import java.util.stream.Collectors;@Servicepublic class UserService implements UserDetailsService, IUserService {    @Autowired    private IUserFeign userFeign;    @Override    public UserDetails loadUserByUsername(String username) {        User user = userFeign.find(username);        if (user == null) {            throw new UsernameNotFoundException("user ' " + username + " ' not found");        }        List<GrantedAuthority> authorities = user.getRoles()                .stream()                .map(role -> new SimpleGrantedAuthority(role.getName()))                .collect(Collectors.toList());        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), user.getEnabled(),                true, true, true, authorities);    }    @Override    public User findByUsername(String username) {        return userFeign.find(username);    }}