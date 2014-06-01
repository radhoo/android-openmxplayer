package net.pocketmagic.android.openmxplayer;
/*
** OpenMXPlayer - Freeware audio player library for Android
** Copyright (C) 2009 - 2014 Radu Motisan, radu.motisan@gmail.com
**
** This file is a part of "OpenMXPlayer" open source library.
**
** OpenMXPlayer is free software; you can redistribute it and/or modify
** it under the terms of the GNU Lesser General Public License as published
** by the Free Software Foundation; either version 3 of the License,
** or (at your option) any later version.
**
** This program is distributed in the hope that it will be useful,
** but WITHOUT ANY WARRANTY; without even the implied warranty of
** MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
** GNU Lesser General Public License for more details.
**
** You should have received a copy of the GNU Lesser General Public License
** along with this program. If not, see <http://www.gnu.org/licenses/>.
*/
public class PlayerStates {
	 /**
     * Playing state which can either be stopped, playing, or reading the header before playing
     */
	public static final int	READY_TO_PLAY = 2;
	public static final int PLAYING = 3; 
	public static final int STOPPED = 4; 
    public int playerState = STOPPED;
    
    public int get() {
    	return playerState;
    }
    
    public void set(int state) { 
    	playerState = state;
    }
    
    
    /**
     * Checks whether the player is ready to play, this is the state used also for Pause (phase 2)
     *
     * @return <code>true</code> if ready, <code>false</code> otherwise
     */
    public synchronized boolean isReadyToPlay() {
        return playerState == PlayerStates.READY_TO_PLAY;
    }
    
    
    /**
     * Checks whether the player is currently playing (phase 3)
     *
     * @return <code>true</code> if playing, <code>false</code> otherwise
     */
    public synchronized boolean isPlaying() {
        return playerState == PlayerStates.PLAYING;
    }
    
    
    /**
     * Checks whether the player is currently stopped (not playing)
     *
     * @return <code>true</code> if playing, <code>false</code> otherwise
     */
    public synchronized boolean isStopped() {
        return playerState == PlayerStates.STOPPED;
    }

 


}
