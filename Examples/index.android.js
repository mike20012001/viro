/**
 * Copyright (c) 2015-present, Viro, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 */
import React, { Component } from 'react';
import {
  AppRegistry,
  Text,
  View
} from 'react-native';

import {
  ViroSceneNavigator,
} from 'react-viro';

var InitialScene = require('./scene1');

export default class ViroSample extends Component {
  render() {
    return (
      <ViroSceneNavigator
        initialScene={{scene: InitialScene}}
        />
    );
  }
}

AppRegistry.registerComponent('ViroSample', () => ViroSample);