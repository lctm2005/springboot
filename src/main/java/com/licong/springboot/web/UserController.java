package com.licong.springboot.web;

import com.licong.springboot.domain.bean.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author licong
 * @date 15-9-7
 */
//@Controller
@RestController
@RequestMapping(value = "/users")
public class UserController {

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User get(@PathVariable Long id) {
        // ...
        return null;
    }

    //@ModelAttribute @ResponseBody
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public User delete(@PathVariable Long id) {
        // ...
        return null;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)
    public User update(@PathVariable Long id) {
        // ...
        return null;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public User save(@PathVariable Long id) {
        // ...
        return null;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public User create(@PathVariable Long id) {
        // ...
        return null;
    }

}
