import { useParams } from "react-router-dom";
import useFetch from "./useFetch";
import { useHistory } from "react-router";

const BlogDetails = () => {
    const {id}=useParams();
    const {data :blog,isPending,error}=useFetch("http://localhost:8082/blogs/"+id);
    const history=useHistory();

    const handleClick=()=>{
        fetch("http://localhost:8082/blogs/"+blog.id,{
            method:"DELETE"
        }).then(()=>{
            // console.log("delete");
            history.push("/");
        })
    }
    return (

        <div className="blog-details">
            {/* <h2>Blog with id {id} is picked!</h2> */}
        {isPending && <div>Loading.....</div>}
        {error && <div>{error}</div>}
        {blog && (
            <article>
                <h2>{blog.title}</h2>
                <p>Written By {blog.author}</p>
                <div>{blog.body}</div>
                <button onClick={handleClick}>delete</button>
            </article>
        )}
        </div>
      );
}
 
export default BlogDetails;