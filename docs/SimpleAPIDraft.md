# Rudimentary explenation of API's
This document is intended for internal use while we implement our code. We 
opted to design these API's to keep our kode loosely coupled and clearly separate.

## Tic.java

Function | Parameter | Return | Description
--- | --- | --- | ----
`void Tic()` | `null` | `null` | Constructor
`char getPlayer()` | `null` | `char` 'x' / 'o' | returns current player
`boolean updateBoard(int field)` | field to mark | boolean value for success | marks new field and returns true for success
`char[] getBoard()` | `null` | `array` representation of board fields | indexes contain 'o', 'x' or ' '.
`boolean isDraw()` | `null` | `boolean` value indicating draw | 
`boolean hasWon()` | `null` | `boolean` value indicating victory | in case of victory getPlayer returns winner

## TicServer.java / "REST API"

Endpoint | Parameter | Return value | Description
--- | --- | --- | ---
`/mark` | `/field` to update | Returns `JSON` representation of board | See [Sample Payload][1] below

### `/mark/` Sample JSON Payload
```JSON
{
  "board": ["1", "x", "o", "4", "o", "x", "x", "o", "9"],
  "gameStatus": "ongoing",
  "nextMove": "x"
}
```
[1]: https://github.com/GitExersiceHnetumjor/sidannarverkefni/blob/master/docs/SimpleAPIDraft.md#sample-json-payload
