package Manager;

public interface General <T>{
    void add(T t);
    void edit(int id, T t);
    void delete(int id);
    T findById(int id);
    void display();
    int findIndexById(int id);
}


