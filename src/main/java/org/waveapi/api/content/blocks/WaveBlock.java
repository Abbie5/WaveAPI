package org.waveapi.api.content.blocks;

import org.waveapi.api.WaveMod;

public class WaveBlock {
    private final String id;
    private final WaveMod mod;

    public WaveBlock(String id, WaveMod mod) {
        this.id = id;
        this.mod = mod;
    }

    public String getId() {return id;}
}
