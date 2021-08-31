import {useState} from 'react';
import {useHistory} from 'react-router-dom'

const Create = () => {
    const [title,setTitle]=useState(' ');
    const [body,setBody]=useState(' ');
    const [author,setAuthor]=useState('mario');
    const history=useHistory();
    
    const handleSubmit=(e)=>{
        e.preventDefault();
        const blog={title,body,author};
        console.log(blog);
        fetch('http://localhost:8082/blogs',{
            method:'POST',
            headers:{"Content-Type":"application/json"},
            body :JSON.stringify(blog)
        }).then(()=>{
            console.log("New blog added");
            // history.go(-1);
            history.push("/");
        }
        )   
    }
    return (
        // <div className="create">
        //     <h2>Add a New Blog</h2>
        // </div>

        <div className="create">
            <h2>Add a new Blog</h2>
            <form onSubmit={handleSubmit}>
                <label>Blog Title : </label>
                <input 
                type="text"
                value={title}
                onChange={(e)=>setTitle(e.target.value)}
                />
                <label>Blog Body : </label>
                <textarea
                value={body}
                onChange={(e)=>setBody(e.target.value)}
                >
                </textarea>
                <label>Blog Author : </label>
                <select
                value={author}
                onChange={(e)=>setAuthor(e.target.value)}
                >
                    <option value="mario">mario</option>
                    <option value="yoshi">yoshi</option>
                </select>
                <button>Add Blogs</button>
            </form>
            {/* {title}
            {body}
            {author} */}

        </div>
      );
}
 
export default Create;