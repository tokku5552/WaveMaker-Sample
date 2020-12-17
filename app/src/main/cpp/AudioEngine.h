//
// Created by physi on 2020/12/17.
//

#ifndef WAVEMAKER_SAMPLE_AUDIOENGINE_H
#define WAVEMAKER_SAMPLE_AUDIOENGINE_H

#include <aaudio/AAudio.h>
#include "Oscillator.h"

class AudioEngine {
public:
    bool start();
    void stop();
    void restart();
    void setToneOn(bool isToneOn);

private:
    Oscillator oscillator_;
    AAudioStream *stream_;
};


#endif //WAVEMAKER_SAMPLE_AUDIOENGINE_H
