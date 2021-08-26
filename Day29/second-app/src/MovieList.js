const MovieList = () => {
    const movies=[{movieId:1,movieName:'Movie1',userId:'U001',rating:5},
    {movieId:2,movieName:'Movie2',userId:'U001',rating:3},
    {movieId:3,movieName:'Movie3',userId:'U002',rating:4},
    {movieId:4,movieName:'Movie4',userId:'U003',rating:2}]

    return (
        <div className="movieList">
            <table>
                <tr>
                    
                    <td>Movie Name</td>
                    <td>User</td>
                    <td>Rating</td>
                </tr>
                {/* <tr>
                    <td>{movies[0].movieId}</td>
                    <td>{movies[0].movieName}</td>
                    <td>{movies[0].userId}</td>
                    <td>{movies[0].rating}</td>
                </tr> */}
                {movies.map((movie)=>(
                    <tr className="moviepreview" key={movie.movieId}>
                        <td>{movie.movieName}</td>
                        <td>{movie.userId}</td>
                        <td>{movie.rating}</td>
                    </tr>
                ))}
                
            </table>
        </div>
      );
}
 
export default MovieList;