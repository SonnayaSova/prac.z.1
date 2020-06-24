package pack;

public class User
{
    public String name;
    public String nickname;
    public int age;

    public User(String name, String nickname, int age)
    {
        this.name = name;
        this.nickname = nickname;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getNickname()
    {
        return nickname;
    }

    public void setNickname(String nickname)
    {
        this.nickname = nickname;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj == null)
            return false;
        if(this.getClass() != obj.getClass())
            return false;
        User user=(User) obj;
        return age == user.age &&
                nickname.equals(user.nickname) &&
                name.equals(user.name);
    }

    @Override
    public String toString()
    {
        return "User{" +
                "name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                '}';
    }

}




