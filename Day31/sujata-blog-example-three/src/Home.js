import { useEffect, useState } from "react";
import BlogList from "./BlogList";

const Home = () => {
  const [blogs, setBlogs] = useState(null);
  const [isPending,setIsPending]=useState(true);
  const [error,setError]=useState(null);

  useEffect(()=>{
    setTimeout(() => {
      fetch('http://localhost:8082/blogs')
    .then(res=>{
      // console.log(res);
      
      return res.json();
    })
    .then(data=>{
      setBlogs(data);
      setIsPending(false);
    })
    .catch(err=>{
      // console.log(err.message);
      setIsPending(false);
      setError(err.message);
    })  
    }, 1000);
    
  },[]);
  return (
    <div className="home">
    {isPending && <div>Loading......</div>}
    {error && <div> {error} </div>}
    {blogs && <BlogList blogs={blogs} title="All Blogs" />}
    
    </div>
  );
}
 
export default Home;