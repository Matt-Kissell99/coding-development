// Pure function = A function that only depends on the arguments 
// Inpure function = A function that depends on API callings, Database callings or any other external values


// Store = the state of components (own container)

// getState() = retrieves the current state of the Reduc store. If we were to run this function at the start, it would be 0 as this is the initial state

// dispatch() = used for changing the state of the application

document.addEventListener('click', () => {
    store.dispatch({ type : 'INCREMENT' })
});

//subscribe = allows DOM elements to be manipulated, it will update the element to the new state 

store.subscribe(() => {
    document.body.innerText = store.getState();
  });

  // TODO list including the tests of state
  const todos = (state = [], action) => {
    switch (action.type) {
      case 'ADD_TODO':
        return [
          ...state,
          {
            id: action.id,
            text: action.text,
            completed: false
          }
        ];
      default:
        return state;
    }
  };
  
  const testAddTodo = () => {
    const stateBefore = [];
    const action = {
        type: 'ADD_TODO',
        id: 0,
        text: 'Learn Redux'
    };
    const stateAfter = [{
        id: 0,
        text: 'Learn Redux',
        completed: false
    }];
  
    deepFreeze(stateBefore);
    deepFreeze(action);
  
    expect(
      todos(stateBefore, action)
    ).toEqual(stateAfter);
  };
  
  testAddTodo();
  console.log('All tests passed')