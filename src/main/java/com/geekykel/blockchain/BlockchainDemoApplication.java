package com.geekykel.blockchain;

import com.geekykel.blockchain.model.ERole;
import com.geekykel.blockchain.model.Role;
import com.geekykel.blockchain.repository.RoleRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Created by Kelvin on 01/07/2021.
 */
@SpringBootApplication
public class BlockchainDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlockchainDemoApplication.class, args);
    }


    @Autowired
    private RoleRepository roleRepository;

    @Bean
    InitializingBean saveUserRoles() {
        return () -> {
            roleRepository.save(new Role(ERole.ROLE_USER));
            roleRepository.save(new Role(ERole.ROLE_ADMIN));
            roleRepository.save(new Role(ERole.ROLE_MODERATOR));
        };
    }

}
