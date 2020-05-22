package com.bl.mockito;

public class ClassToTest {
    private final MyDatabase databaseMock;

    public ClassToTest(MyDatabase databaseMock) {
        this.databaseMock = databaseMock;
    }

    public boolean queryClassToTest(String query) {
        return this.databaseMock.queryMyDataBase( query );
    }
}
