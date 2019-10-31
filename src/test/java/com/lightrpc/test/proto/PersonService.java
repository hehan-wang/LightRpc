package com.lightrpc.test.proto;

import java.util.List;

/**
 * Created by david on 2016-03-10.
 */
public interface PersonService {
    List<Person> GetTestPerson(String name, int num);
}
