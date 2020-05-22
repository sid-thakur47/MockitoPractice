package com.bl.mockito;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MockitoTest {
    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();
    CustomerReader customerReader = new CustomerReader();
    @Mock
    MyDatabase databaseMock;

    @Test
    public void testQuery() {
        ClassToTest classTest = new ClassToTest( databaseMock );
        when( databaseMock.queryMyDataBase( "* from t" ) ).thenReturn( true );
        boolean check = classTest.queryClassToTest( "* from t" );
        Assert.assertTrue( check );
    }
    @Test
    public void customerReader() {
        Customer customer = new Customer( "Siddhesh","thakur" );
        EntityManager entityManager=mock(EntityManager.class);
        when( entityManager.find( Customer.class, 1L ) ).thenReturn( customer );
        customerReader.setEntityManager( entityManager );
        String fullName = customerReader.findFullName( 1L );
        Assert.assertEquals( "Siddhesh thakur", fullName );
    }
}