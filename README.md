Very rough turing machine emulator
===========================================

Plan is to use this so have something can do more with later.
Will read from a standardized text file, something like:
```
#Alphabet:
A,B
#States: value to write under tape head (_ for nothing),amount to move head by, halt, map of alphabet tape values at current head to new state ids. State id is row-index
B,1,false,[1,1]
B,1,false,[2,2]
B,1,false,[3,3]
B,1,false,[4,4]
B,1,false,[5,5]
B,1,false,[5,5]
```

Makes a turing machine which moves to the right 5 times, writing B as it goes, then halts.

Running the current Java program gives roughly that:
```
Current state: State{stateId=1, toWrite=B, toMove=1, isHaltingState=false, indexOfStatesToTransitionTo=[2, 2]} headPosition: 1  tape: BAAAAAAAAA
Current state: State{stateId=2, toWrite=B, toMove=1, isHaltingState=false, indexOfStatesToTransitionTo=[3, 3]} headPosition: 2  tape: BBAAAAAAAA
Current state: State{stateId=3, toWrite=B, toMove=1, isHaltingState=false, indexOfStatesToTransitionTo=[4, 4]} headPosition: 3  tape: BBBAAAAAAA
Current state: State{stateId=4, toWrite=B, toMove=1, isHaltingState=false, indexOfStatesToTransitionTo=[5, 5]} headPosition: 4  tape: BBBBAAAAAA
Current state: State{stateId=5, toWrite=B, toMove=1, isHaltingState=true, indexOfStatesToTransitionTo=[5, 5]} headPosition: 5  tape: BBBBBAAAAA
Halted! In state: State{stateId=5, toWrite=B, toMove=1, isHaltingState=true, indexOfStatesToTransitionTo=[5, 5]}
```
