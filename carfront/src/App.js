import "./App.css";
import { AppBar, Toolbar, Typography } from "@mui/material";
import Login from "./Components/Login";

function App() {
  return (
    <div className="App">
      <AppBar position="static">
        <Toolbar>
          <Typography variant="h6">Car Shop</Typography>
        </Toolbar>
      </AppBar>
      <Login />
    </div>
  );
}

export default App;
