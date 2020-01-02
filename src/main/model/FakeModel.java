package main.model;

import main.bean.User;

import java.util.LinkedList;

public class FakeModel implements Model {

    private ModelData modelData = new ModelData();


    @Override
    public ModelData getModelData() {
        return this.modelData;
    }

    @Override
    public void loadUsers() {
        modelData.setUsers (new LinkedList<User>() {{
            add(new User("A", 1, 1));
            add(new User("B", 2, 2));
            add(new User("C", 3, 1));
            add(new User("D", 4, 2));
        }});
    }

    @Override
    public void loadDeletedUsers() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void loadUserById(long userId) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteUserById(long id) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void changeUserData(String name, long id, int level) {
        throw new UnsupportedOperationException();
    }
}
