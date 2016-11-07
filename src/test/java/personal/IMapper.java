package personal;

import org.apache.ibatis.annotations.Select;

public interface IMapper{
    @Select ("select * from blog where id=#{id}")
    Integer selectBlog(int id);


}