package com.luke.clones.map.model2p;

import com.luke.clones.map.model.MapModel;
import com.luke.clones.map.model.MapType;
import com.luke.clones.model.type.PlayerPosition;
import com.luke.clones.model.type.PlayerType;
import com.luke.clones.model.type.Position;

/* The MIT License (MIT)

Copyright (c) 2016 �ukasz Dziak

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE. */

public class InTheMiddleMapModel extends MapModel {
	
	public InTheMiddleMapModel() {
		super.numberOfPlayers = 2;
		super.mapName = "In the middle";
		super.mapType = MapType.ASYMMETRIC;
		
		super.mapSize = new int[]{15,11};

		super.solids = new Position[]{
		new Position(0,0),
		new Position(0,1),
		new Position(0,2),
		new Position(0,3),
		new Position(0,4),
		new Position(0,5),
		new Position(0,6),
		new Position(0,7),
		new Position(0,8),
		new Position(0,9),
		new Position(1,10),
		new Position(11,0),
		new Position(11,1),
		new Position(11,2),
		new Position(11,3),
		new Position(5,10),
		new Position(9,0),
		new Position(11,7),
		new Position(12,10),
		new Position(9,1),
		new Position(9,10),
		new Position(11,8),
		new Position(9,2),
		new Position(11,9),
		new Position(9,3),
		new Position(9,7),
		new Position(1,0),
		new Position(9,8),
		new Position(1,1),
		new Position(9,9),
		new Position(1,2),
		new Position(1,3),
		new Position(1,4),
		new Position(1,5),
		new Position(1,6),
		new Position(1,7),
		new Position(1,8),
		new Position(1,9),
		new Position(11,10),
		new Position(12,0),
		new Position(12,1),
		new Position(12,2),
		new Position(12,3),
		new Position(12,7),
		new Position(12,8),
		new Position(12,9),
		new Position(2,0),
		new Position(2,1),
		new Position(2,2),
		new Position(2,3),
		new Position(2,7),
		new Position(2,8),
		new Position(2,9),
		new Position(13,0),
		new Position(0,10),
		new Position(13,1),
		new Position(13,2),
		new Position(13,3),
		new Position(13,4),
		new Position(4,10),
		new Position(13,5),
		new Position(13,6),
		new Position(13,7),
		new Position(13,8),
		new Position(13,9),
		new Position(3,0),
		new Position(3,1),
		new Position(3,2),
		new Position(3,3),
		new Position(3,7),
		new Position(3,8),
		new Position(3,9),
		new Position(10,10),
		new Position(14,0),
		new Position(14,1),
		new Position(14,2),
		new Position(14,3),
		new Position(14,4),
		new Position(14,5),
		new Position(14,6),
		new Position(14,7),
		new Position(14,8),
		new Position(14,9),
		new Position(4,0),
		new Position(4,1),
		new Position(4,2),
		new Position(4,3),
		new Position(4,7),
		new Position(4,8),
		new Position(4,9),
		new Position(3,10),
		new Position(14,10),
		new Position(5,0),
		new Position(5,1),
		new Position(5,2),
		new Position(5,3),
		new Position(5,7),
		new Position(5,8),
		new Position(5,9),
		new Position(2,10),
		new Position(13,10),
		new Position(10,0),
		new Position(10,1),
		new Position(10,2),
		new Position(10,3),
		new Position(10,7),
		new Position(10,8),
		new Position(10,9),
		};

		super.playerPositions = new PlayerPosition[]{
		new PlayerPosition(7, 5, PlayerType.BLUE),
		new PlayerPosition(12, 5, PlayerType.RED),
		new PlayerPosition(2, 5, PlayerType.RED),
		new PlayerPosition(7, 10, PlayerType.RED),
		new PlayerPosition(7, 0, PlayerType.RED),
		};
	}

}
