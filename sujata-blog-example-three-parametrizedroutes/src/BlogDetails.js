import { useParams } from "react-router-dom";
import useFetch from "./useFetch";

const BlogDetails = () => {
    const {id}=useParams();
    const {data :blog,isPending,error}=useFetch("http://localhost:8082/blogs/"+id);
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
            </article>
        )}
        </div>
      );
}
 
export default BlogDetails;