//
//  VRTSkybox.h
//  React
//
//  Created by Raj Advani on 10/5/16.
//  Copyright © 2016 Viro Media. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "RCTImageSource.h"
#import "VRTControl.h"
#import "VRTCubeMap.h"
#import "VRTImageAsyncLoaderEventDelegate.h"

@interface VRTSkybox : VRTControl<VRTImageAsyncLoaderEventDelegate>

@property (nonatomic) UIColor *color;
@property (nonatomic) VRTCubeMap *source;
@property (nonatomic, copy) RCTDirectEventBlock onLoadStart;
@property (nonatomic, copy) RCTDirectEventBlock onLoadEnd;

- (instancetype)initWithBridge:(RCTBridge *)bridge;

@end