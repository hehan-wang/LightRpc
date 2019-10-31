package com.lightrpc.test.server;

import com.lightrpc.server.RpcService;
import com.lightrpc.test.proto.PersonService;
import com.lightrpc.test.proto.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by david on 2016-03-10.
 */
@RpcService(PersonService.class)
public class PersonServiceImpl implements PersonService {

    @Override
    public List<Person> GetTestPerson(String name, int num) {
        List<Person> persons = new ArrayList<>(num);
        for (int i = 0; i < num; ++i) {
            persons.add(new Person(Integer.toString(i), name));
        }
        return persons;
    }
}
