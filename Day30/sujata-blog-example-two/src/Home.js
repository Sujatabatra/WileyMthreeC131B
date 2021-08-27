import { useEffect, useState } from "react";
import BlogList from "./BlogList";

const Home = () => {
  const [blogs, setBlogs] = useState(null);

  // const [name,setName]=useState("Sujata");

  // const handleDelete=(id)=>{
  //     const newBlog=blogs.filter(blog=>blog.id!==id);
  //     setBlogs(newBlog);
  // }

  // const handleNameChange=()=>{
  //   setName("Sujata Batra");
  // }
  /*
  run with every render and every state change
  with [] as second argument useEffect will run once while
   rendering the page
  */
  // useEffect(()=>{
  //   console.log("use effect ran");
  //   console.log(blogs);
  // },[blogs]);

  useEffect(()=>{
    fetch('http://localhost:8082/blogs')
    .then(res=>{
      return res.json();
    })
    .then(data=>{
      console.log(data);
      setBlogs(data);
    })
  },[]);
  return (
    <div className="home">
      {/* <p>{name}</p>
      <button onClick={handleNameChange}>Click to change name</button>
      <BlogList blogs={blogs} title="All Blogs"  handleDelete={handleDelete}/> */}
      {/* <BlogList blogs={blogs.filter((blog)=>blog.author==='mario')} title="Mario's Blogs"/> */}
    
    {blogs && <BlogList blogs={blogs} title="All Blogs" />}
    
    </div>
  );
}
 
export default Home;
